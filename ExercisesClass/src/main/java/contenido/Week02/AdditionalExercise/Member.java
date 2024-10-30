package contenido.Week02.AdditionalExercise;

public class Member {
    private int id;
    private String name;
    private double mount;

    public Member(int id, String name, double mount) {
        this.id = id;
        this.name = name;
        this.mount = mount;
    }
    //#region GettersAndSetters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMount() {
        return mount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMount(double mount) {
        this.mount = mount;
    }
    //#endregion

    public void AgregarMonto(double additionalMount){
        this.mount = mount + additionalMount;
    }
}
