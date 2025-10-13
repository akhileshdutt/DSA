package BackTracking;

public class MazeWithObs {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };
        pathWithRistriction("", 0, 0, board);
    }
    static void pathWithRistriction(String p, int r, int c, boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathWithRistriction(p+"D", r+1, c, maze);
        }
        if(c<maze[0].length-1){
            pathWithRistriction(p+"R", r, c+1, maze);
        }
    }
}
