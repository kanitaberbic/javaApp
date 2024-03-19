import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class deletaTableSport {

    public static
    class PlayerTable extends JFrame {
        private JTable table;
        private JButton deleteButton;

        public PlayerTable() {
            // Inicijalizacija tabele i dugmeta
            table = new JTable();
            deleteButton = new JButton("Delete");

            // Dodavanje akcije na dugme Delete
            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        int choice = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da želite obrisati ovog igrača?", "Potvrda brisanja", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            // Ovdje dodajte logiku za brisanje zapisa iz baze podataka
                            // Ova akcija će se izvršiti samo ako korisnik odabere "Yes" u dijalogu potvrde
                            // Možete dohvatiti podatke o odabranom igraču iz tabele pomoću table.getValueAt(selectedRow, column) metode
                            // Zatim izvršite brisanje iz baze podataka
                            // Nakon toga, osvježite prikaz tabele
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Molimo odaberite igrača za brisanje.");
                    }
                }
            });

            // Ovdje dodajte logiku za prikazivanje tabele i dugmeta u vašem UI-u
        }

        // Ovo je samo primjer kako bi se pokazalo kako se koristi JOptionPane za dijalog potvrde

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new PlayerTable().setVisible(true);
                }
            });
        }
    }

}

