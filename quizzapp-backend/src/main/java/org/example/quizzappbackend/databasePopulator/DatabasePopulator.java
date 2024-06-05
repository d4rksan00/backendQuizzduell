package org.example.quizzappbackend.databasePopulator;

import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.entity.Question;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.entity.QuizRound;
import org.example.quizzappbackend.repository.QuizRepo;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabasePopulator implements CommandLineRunner {

    private QuizRepo quizRepo;

    @Override
    public void run(String... args) throws Exception {

        List<Player> friendList = Arrays.asList();
        List<Quiz> quizzes = Arrays.asList();

        Player p1 = new Player(1L,"Dr. med. Rasen", false,0,0L,0L, 0L, friendList,quizzes);
        Player p2 = new Player(2L,"Dr. Acula", false,0,0L,0L, 0L, friendList,quizzes);
        Player p3 = new Player(3L,"Dr. Ompete", false,0,0L,0L, 0L, friendList,quizzes);

        List<Player> oponents = Arrays.asList(p1,p2);

        Question question1 = new Question(1L,p1);
        Question question2 = new Question();
        Question question3 = new Question();
        Question question4 = new Question();
        Question question5 = new Question();

        List<Question> questions = Arrays.asList(question1,question2,question3);


        QuizRound qr1 = new QuizRound(1L,questions);
        QuizRound qr2 = new QuizRound(2L,questions);
        QuizRound qr3 = new QuizRound(3L,questions);
        QuizRound qr4 = new QuizRound(4L,questions);
        QuizRound qr5 = new QuizRound(5L,questions);
        QuizRound qr6 = new QuizRound(6L,questions);

        List<QuizRound> rounds = new ArrayList<QuizRound>();

        rounds = Arrays.asList(qr1,qr2,qr3,qr4,qr5,qr6);

        Quiz q1 = new Quiz(1L,p1,p2,rounds);

        quizRepo.save(q1);

    }
}
