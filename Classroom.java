public class Classroom {

    public static void main (String[] arg){
        Board board = new Board();
        Professor p = new Professor();
        p.setInfo("Hello");
        p.write(board);
        Student s = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        board.addObserver(s);
        board.addObserver(s2);
        board.addObserver(s3);
        board.addObserver(s4);
        board.addObserver(s5);
        board.addObserver(s6);
        p.setInfo("Bye");
        p.write(board);

    }
}
