import org.example.wallace.RedeSocial;
import org.example.wallace.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class ExemploObserverTest {

    @Test
    public void testProcessarStatus() {
        Usuario usuario = new Usuario("João");
        RedeSocial redeSocial = new RedeSocial();
        redeSocial.adicionarObservador(usuario);

        redeSocial.novaAtividade("João atualizou seu status.");

        Assert.assertEquals("Processamento incorreto do status do usuário", "Status atualizado: João", usuario.getUltimaAtividadeProcessada());
    }

    @Test
    public void testProcessarFoto() {
        Usuario usuario = new Usuario("Maria");
        RedeSocial redeSocial = new RedeSocial();
        redeSocial.adicionarObservador(usuario);

        redeSocial.novaAtividade("Maria postou uma foto.");

        Assert.assertEquals("Processamento incorreto da foto do usuário", "Nova foto postada: Maria", usuario.getUltimaAtividadeProcessada());
    }

    @Test
    public void testUsuarioSemAtividade() {
        Usuario usuario = new Usuario("Pedro");
        RedeSocial redeSocial = new RedeSocial();
        redeSocial.adicionarObservador(usuario);

        redeSocial.novaAtividade("Maria postou uma foto.");

        Assert.assertNull("Atividade processada incorretamente", usuario.getUltimaAtividadeProcessada());
    }
}