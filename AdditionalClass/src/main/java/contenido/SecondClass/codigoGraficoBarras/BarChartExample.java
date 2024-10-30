package contenido.SecondClass.codigoGraficoBarras;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class BarChartExample extends JFrame {

    public BarChartExample(String title) {
        super(title);

        // Crear el dataset
        DefaultCategoryDataset dataset = createDataset();

        // Crear el gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Gráfico de barras ejemplo", 
                "Categoría", 
                "Valor", 
                dataset, 
                PlotOrientation.VERTICAL, 
                true, true, false);

        // Crear el panel del gráfico y agregarlo al JFrame
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Añadir datos al dataset
        dataset.addValue(1, "Categoría 1", "A");
        dataset.addValue(3, "Categoría 1", "B");
        dataset.addValue(5, "Categoría 1", "C");
        dataset.addValue(7, "Categoría 2", "A");
        dataset.addValue(6, "Categoría 2", "B");
        dataset.addValue(8, "Categoría 2", "C");

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BarChartExample example = new BarChartExample("Ejemplo de gráfico de barras");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}

