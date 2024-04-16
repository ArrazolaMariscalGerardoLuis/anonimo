public class Laberinto {
    public String[][] PrimerNivel() {

        String matriz[][] ={
                {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"},
                {"a", "a", "a", "a", "a", "a", "a", " ", "a", "a", "a", "o", " ", " ", "a", "a", "a"},
                {"a", "a", "a", "a", " ", " ", " ", "o", " ", " ", "a", " ", "a", "o", "a", "a", "a"},
                {"a", "a", "a", "a", " ", "a", "a", " ", "a", " ", "o", " ", "a", " ", " ", "a", "a"},
                {"a", " ", " ", " ", "o", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", "a", "a"},
                {"a", " ", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", " ", "a"},
                {"a", " ", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "o", "a", "a"},
                {"a", " ", "a", "a", "a", "a", " ", " ", "a", "a", "a", "a", "a", "a", " ", "a", "a"},
                {"a", " ", " ", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a"},
                {"a", "a", "a", " ", "a", "a", "a", "x", "a", " ", " ", " ", "a", "a", " ", " ", "a"},
                {"a", "a", "a", " ", " ", " ", "a", " ", "a", " ", "a", " ", " ", "a", "a", " ", "a"},
                {"a", "a", "a", "a", " ", "a", "a", " ", " ", " ", "a", "a", " ", "a", " ", " ", "a"},
                {"a", "a", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", " ", " ", "o", "a", "a"},
                {"a", "a", " ", " ", " ", "a", "a", "a", "a", "a", " ", "a", " ", "a", " ", "a", "a"},
                {"a", "a", " ", "a", "a", "a", "a", "a", " ", " ", " ", "a", "o", " ", " ", " ", "a"},
                {"a", "*", " ", "a", "a", "a", "o", " ", " ", "a", "a", "a", " ", "a", "a", " ", "a"},
                {"a", "a", " ", " ", " ", "a", " ", "a", "a", "a", "a", "a", " ", "a", "a", "a", "a"},
                {"a", "a", "a", "a", " ", " ", " ", "a", "a", "a", "a", "a", " ", "a", "a", "a", "a"},
                {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}};

        return matriz;
    }
    
    public String[][] SegundoNivel() {
        String[][] matriz = {
            {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a", "a", "a", "a", "a"},
            {"a", "a", " ", "a", "a", "a", " ", "a", "a", "a", " ", " ", " ", " ", " ", "a", "a"},
            {"a", " ", "*", "a", "a", "a", " ", " ", " ", " ", "a", " ", "a", "a", "a", "a", "a"},
            {"a", "a", " ", " ", " ", " ", " ", " ", " ", " ", "a", " ", "a", "a", "a", "a", "a"},
            {"a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", "a", "a", "a"},
            {"a", "a", " ", " ", "o", " ", "o", "a", " ", " ", " o", " ", " ", "a", "a", "a", "a"},
            {"a", "a", " ", "a", "a", "a", "a", "a", "a", "a", " ", "a", " ", "a", "a", "a", "a"},
            {"a", "a", " ", "a", "a", "a", "a", "a", "a", "a", " ", "a", " ", "a", "a", "a", "a"},
            {"a", "a", " ", " ", " ", "a", "a", "a", "a", "a", "o", "a", " ", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", " ", " ", " ", " ", " ", "a", "a"},
            {"a", "a", "a", " ", "a", " ", "a", " ", " ", " ", "a", "a", "a", "a", " ", "a", "a"},
            {"a", "a", "a", " ", "a", " ", "a", " ", "a", " ", "a", "a", "a", "a", " ", "a", "a"},
            {"a", "a", " ", " ", " ", " ", "a", " ", "a", " ", "a", "a", "a", "a", " ", "a", "a"},
            {"a", "a", " ", " ", " ", " ", " ", " ", "a", "o", " ", " ", " ", "a", " ", "a", "a"},
            {"a", "a", " ", "a", " ", "a", "a", "a", "a", " ", "a", "a", " ", "a", " ", " ", "a"},
            {"a", "x", " ", "o", " ", "a", " ", "o", " ", " ", "a", "a", " ", " ", " ", " ", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}};
        return matriz;
    }
        
          public String[][] TercerNivel() {
        String[][] matriz = {
            {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", " ", "a", " ", "a", "a", "a", " ", "o", " ", "o", "a", "a", "a", "a", "a"},
            {"a", " ", " ", " ", " ", " ", "o", "a", " ", "a", "a", " ", " ", " ", " ", " ", "a"},
            {"a", " ", "a", "a", "a", "a", " ", " ", " ", " ", " ", " ", "a", "a", "a", " ", "a"},
            {"a", " ", "a", "a", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", " ", " ", "a"},
            {"a", " ", "a", "a", "a", "a", " ", "a", "a", "a", "a", " ", " ", " ", " ", " ", "a"},
            {"a", " ", " ", "a", "a", "a", " ", "a", "a", "a", " ", " ", "a", "a", " ", "a", "a"},
            {"a", "a", " ", " ", " ", " ", " ", "a", "a", "a", "o", "a", "a", " ", "a", " ", "a"},
            {"a", "a", "a", " ", "a", "a", " ", "a", "a", "a", " ", " ", "a", " ", "a", " ", "a"},
            {"a", "a", "a", " ", "a", "a", " ", " ", "a", "a", "a", " ", "a", " ", "a", " ", "a"},
            {"a", " ", " ", " ", " ", " ", "a", " ", " ", "a", "a", " ", " ", " ", " ", " ", "a"},
            {"a", "a", "a", "a", "a", " ", "a", " ", " ", "a", "a", "a", "a", "a", "a", " ", "a"},
            {"a", " ", " ", " ", "a", " ", "a", " ", "a", "a", "a", "a", "a", "a", "a", " ", "a"},
            {"a", " ", "a", " ", "a", " ", "a", " ", "a", "a", "a", " ", "a", " ", "a", " ", "a"},
            {"a", " ", "a", " ", " ", " ", "a", " ", "a", " ", " ", " ", "a", " ", "a", " ", "a"},
            {"a", " ", "a", "a", "a", "a", "a", " ", "a", "a", "a", " ", " ", " ", "a", "x", "a"},
            {"a", " ", "a", "a", "a", "a", "a", " ", "a", "a", "a", " ", "a", " ", "a", "a", "a"},
            {"a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a", " ", " ", "*", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}};
        return matriz;
    }
}
