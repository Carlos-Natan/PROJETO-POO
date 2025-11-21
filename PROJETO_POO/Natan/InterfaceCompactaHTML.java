import java.awt.*;
import javax.swing.*;

public class InterfaceCompactaHTML {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Interface Compacta HTML/CSS");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);

            JTabbedPane abas = new JTabbedPane();

            // Aba Principal
            abas.addTab("Principal", criarPainelHTML(frame, "Clique aqui!", 
                "Você clicou no botão da aba Principal!", 
                "<h1 style='color: teal;'>Bem-vindo à aba Principal</h1><p style='font-size:14px;'>Use HTML e CSS livremente!</p>"));

            // Aba Configurações
            abas.addTab("Configurações", criarPainelHTML(frame, "Salvar", 
                "Configurações salvas com sucesso!", 
                "<h2 style='color: navy;'>Configurações</h2><p style='color: gray;'>Aqui você pode customizar a interface.</p>"));

            // Aba Sobre
            abas.addTab("SOBRE", criarPainelHTML(frame, null, null, 
                "<h1 style='color: purple;'>Sobre</h1><p>Este é um exemplo de uso avançado de HTML/CSS dentro de Swing.</p>"
                + "<img src='file:./p.png' width='500' height='350'>"));

            frame.add(abas);
            frame.setVisible(true);
        });
    }

    private static JPanel criarPainelHTML(JFrame frame, String textoBotao, String mensagem, String html) {
        JPanel panel = new JPanel(new BorderLayout());

        // Área HTML
        JEditorPane editor = new JEditorPane("text/html", html);
        editor.setEditable(false);
        editor.setOpaque(false);
        JScrollPane scroll = new JScrollPane(editor);
        scroll.setBorder(null);
        panel.add(scroll, BorderLayout.CENTER);

        // Botão opcional
        if (textoBotao != null) {
            JButton botao = new JButton(textoBotao);
            botao.addActionListener(e -> JOptionPane.showMessageDialog(frame, mensagem));
            JPanel painelBotao = new JPanel();
            painelBotao.add(botao);
            painelBotao.setOpaque(false);
            panel.add(painelBotao, BorderLayout.SOUTH);
        }

        panel.setOpaque(false);
        return panel;
    }
}