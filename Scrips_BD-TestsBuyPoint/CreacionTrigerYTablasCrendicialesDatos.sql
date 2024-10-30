use BD_TestBuyPoint
go
create table CredencialesTienda(
	ID INT NOT NULL IDENTITY(1,1),
	ID_Credenciales VARCHAR NOT NULL,
	Usuario VARCHAR(10),
	Contraseña VARCHAR(10)

	CONSTRAINT PK_CredencialesTienda PRIMARY KEY (ID_Credenciales)
)
go
--Cambiando el nombre
EXEC sp_rename 'CredencialesTienda.ID_Credenciales','ID_CredencialesTienda', 'COLUMN'
GO
--Cambiando la el tamaño de caracteres de la columna ID_CredencialesTienda
ALTER TABLE CredencialesTienda DROP CONSTRAINT PK_CredencialesTienda
GO--Borrando PK para poder modificar la longitud la columna
ALTER TABLE CredencialesTienda
	ALTER COLUMN ID_CredencialesTienda VARCHAR(10) NOT NULL
GO--Modificando la longitud de caracteres
ALTER TABLE CredencialesTienda
	ADD CONSTRAINT PK_CredencialesTienda PRIMARY KEY (ID_CredencialesTienda)
GO--Creando nuevamente la clave primaria

create table DatoTienda(
	ID INT NOT NULL,
	ID_DatoTienda VARCHAR(10)NOT NULL,
	ID_CredencialesTienda VARCHAR(10)NOT NULL UNIQUE,
	Nombre VARCHAR(10)NOT NULL,
	Direccion VARCHAR(30)NOT NULL,
	CorreoElectronico VARCHAR(20)NOT NULL

	CONSTRAINT PK_DatoTienda PRIMARY KEY (ID_DatoTienda)
)
GO
ALTER TABLE DatoTienda
	ADD CONSTRAINT FK_DatoTienda_CredencialesTienda 
		FOREIGN KEY (ID_CredencialesTienda) REFERENCES CredencialesTienda(ID_CredencialesTienda)
GO
ALTER TABLE DatoTienda
	DROP COLUMN ID
GO
ALTER TABLE DatoTienda
	ADD ID INT NOT NULL IDENTITY(1,1)
GO
--DROP TABLE DatoTienda
/*CREANDO TIGGERS PARA TABLA CREDENCIALESTIENDA*/
CREATE TRIGGER TRG_ID_CredencialesTienda
ON CredencialesTienda
INSTEAD OF INSERT
AS
BEGIN
	DECLARE @MAX_NUM INT;
	DECLARE @NEW_ID_CredenciealesTienda VARCHAR(10);

	SELECT @MAX_NUM = ISNULL(MAX(CAST(SUBSTRING(ID_CredencialesTienda, 3, LEN(ID_CredencialesTienda) - 2) AS INT)), 0) + 1
	FROM CredencialesTienda

	SET @NEW_ID_CredenciealesTienda = 'CT' + CAST(@MAX_NUM AS VARCHAR);

	INSERT INTO CredencialesTienda (ID_CredencialesTienda, Usuario,Contraseña)
		SELECT @NEW_ID_CredenciealesTienda, Usuario, Contraseña FROM inserted;
END;
--DROP TRIGGER TRG_ID_CredencialesTienda
GO
--CREANDO TIGGERS PARA TABLA DATOTIENDA
--DROP TRIGGER TRG_ID_DatoTienda;
CREATE TRIGGER TRG_ID_DatoTienda
ON DatoTienda
INSTEAD OF INSERT
AS
BEGIN
	DECLARE @MAX_NUM INT;
	DECLARE @NEW_ID VARCHAR(10);

	SELECT @MAX_NUM = ISNULL(MAX(CAST(SUBSTRING(ID_DatoTienda, 3, LEN(ID_DatoTienda) - 2) AS INT)), 0) + 1
	FROM DatoTienda

	SET @NEW_ID = 'DT' + CAST(@MAX_NUM AS VARCHAR);

	INSERT INTO DatoTienda (ID_DatoTienda,ID_CredencialesTienda, Nombre,Direccion, CorreoElectronico)
		SELECT @NEW_ID,ID_CredencialesTienda, Nombre, Direccion, CorreoElectronico FROM inserted;
END;
GO
INSERT INTO DatoTienda(ID_CredencialesTienda, Nombre,Direccion, CorreoElectronico)
	VALUES ('TP1','Mariano', 'Casa','mariano@gmail')

	SELECT *
		FROM DatoTienda