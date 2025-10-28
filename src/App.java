public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("你好，世界！");
        System.out.println("提示");
        javax.swing.SwingUtilities.invokeLater(() -> {
            javax.swing.JOptionPane pane = new javax.swing.JOptionPane("你好，世界！", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            javax.swing.JDialog dialog = pane.createDialog(null, "提示");
            dialog.setModal(false);
            dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            javax.swing.Timer timer = new javax.swing.Timer(5000, e -> dialog.dispose());
            timer.setRepeats(false);
            timer.start();
        });
    }
}