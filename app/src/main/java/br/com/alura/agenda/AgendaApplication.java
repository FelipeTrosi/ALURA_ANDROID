package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosTeste();
    }

    private void criaAlunosTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salvar(new Aluno("Felipe", "977313054", "felipetrosi123@gmail.com"));
        dao.salvar(new Aluno("Braufa", "930420302", "braufagelio523@gmail.com"));
    }
}
