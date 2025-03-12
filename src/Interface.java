import javax.swing.*;

/**
 * Interface grafica del proyecto
 */
public class Interface {
    /**
     *  Cuadro de dialogo utilizando JOptionPane
     */
    public void dialog() {
        JOptionPane.showMessageDialog(null, "Hola Examen!");
 }
    /**
     * Dialogo con mensaje de error
     */
    public void error() {
        JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
    }
}