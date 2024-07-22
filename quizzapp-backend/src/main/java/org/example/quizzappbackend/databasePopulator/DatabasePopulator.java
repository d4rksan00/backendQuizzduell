package org.example.quizzappbackend.databasePopulator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.entity.Question;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.entity.QuizRound;
import org.example.quizzappbackend.repository.PlayerRepo;
import org.example.quizzappbackend.repository.QuestionRepo;
import org.example.quizzappbackend.repository.QuizRepo;
import org.example.quizzappbackend.repository.QuizRoundRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
@Getter
public class DatabasePopulator implements CommandLineRunner {

    private final QuizRepo quizRepo;
    private final PlayerRepo playerRepo;
    private final QuizRoundRepo quizRoundRepo;
    private final QuestionRepo questionRepo;

    @Override
    public void run(String... args) throws Exception {

//        List<Player> friendList = Arrays.asList();
//        List<Quiz> quizzes = Arrays.asList();
//
//        Player p1 = new Player(null,"Dr. med. Rasen", false,0,0L,0L, 0L, friendList,quizzes);
//        Player p2 = new Player(null,"Dr. Acula", false,0,0L,0L, 0L, friendList,quizzes);
//        Player p3 = new Player(null,"Dr. Ompete", false,0,0L,0L, 0L, friendList,quizzes);
//
//        List<Player> oponents = Arrays.asList(p1,p2);
//
//        Question question1 = new Question(null, p1);
//        Question question2 = new Question();
//        Question question3 = new Question();
//        Question question4 = new Question();
//        Question question5 = new Question();
//
//        List<Question> questions = Arrays.asList(question1,question2,question3);
//
//
//        QuizRound qr1 = new QuizRound(null,questions);
//        QuizRound qr2 = new QuizRound(null,questions);
//        QuizRound qr3 = new QuizRound(null,questions);
//        QuizRound qr4 = new QuizRound(null,questions);
//        QuizRound qr5 = new QuizRound(null,questions);
//        QuizRound qr6 = new QuizRound(null,questions);
//
//        List<QuizRound> rounds = new ArrayList<QuizRound>();
//
//        rounds = Arrays.asList(qr1,qr2,qr3,qr4,qr5,qr6);
//
//        Quiz q1 = new Quiz(null,p1,p2,rounds);
//
//        quizRepo.save(q1);

        Player p1 = new Player(null,"Dr. med. Rasen","rasen@drmed.com", "8d9&YDMR3Vd6E&", false,0,0L,0L, 0L, null, null);
        Player p2 = new Player(null,"Dr. Acula","DrAcula@gmail.com", "8d9&YDMR3Vd6E&", false,0,0L,0L, 0L, null, null);
        Player p3 = new Player(null,"Dr. Eieck","DrEieck.com", "8d9&YDMR3Vd6E&", false,0,0L,0L, 0L, null, null);
        Player p4 = new Player(null,"Dr. Ambeldor","DrAmbeldor@gmail.com", "8d9&YDMR3Vd6E&", false,0,0L,0L, 0L, null, null);
        Player p5 = new Player(null,"Dr. Ive","DrIve@gmail.com", "8d9&YDMR3Vd6E&", false,0,0L,0L, 0L, null, null);
        Player p6 = new Player(null,"Dr. Achen","DrAchen@gmail.com", "8d9&YDMR3Vd6E&", false,0,0L,0L, 0L, null, null);

        playerRepo.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6));
        p4.setFriendList(Arrays.asList(p1,p2,p3));
        playerRepo.save(p4);



        Question question1 = new Question(null, "Welches Land ist das grösßte Land der Erde nach Fläche?","Russland","China","Kanada","USA");
        Question question2 = new Question(null,"Welches Land hat die meisten olympischen Goldmedaillen im Schwimmen gewonnen?", "Vereinigte Staaten","Australien", "Deutschland","Niederlande");
        Question question3 = new Question(null, "Welches chemische Element hat das Symbol Au?", "Gold","Kupfer","Silber","Platin");
        Question question4 = new Question(null, "Wer schrieb den Roman \"Der Herr der Ringe\"?", "J.R.R. Tolkien","C.S. Lewis","J.K. Rowling","Douglas Adams");
        Question question5 = new Question(null, "Wer schuf das Gemälde \"Mona Lisa\"?", "Leonardo da Vinci","Michelangelo","Raphael","Sandro Botticelli");
        Question question6 = new Question(null, "Welches Musikinstrument ist das größte Streichinstrument?", "Kontrabass","Cello","Bratsche","Violine");

//        questionRepo.saveAll(Arrays.asList(question1,question2,question3,question4,question5, question6));


        List<Question> questionsPlayer1 = Arrays.asList(question1,question2,question3);
        List<Question> questionsPlayer2 = Arrays.asList(question4,question5,question6);


        QuizRound qr1 = new QuizRound(null,questionsPlayer1,p1);
        QuizRound qr2 = new QuizRound(null,questionsPlayer2,p2);

//        this.quizRoundRepo.saveAll(Arrays.asList(qr1,qr2));
//
        Quiz q1 = new Quiz(null,p1,p2,Arrays.asList(qr1,qr2));
        this.quizRepo.save(q1);


    }
}
