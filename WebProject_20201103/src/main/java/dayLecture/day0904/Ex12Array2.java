package dayLecture.day0904;

public class Ex12Array2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[][] arr = {
                {"red", "green", "blue"},
                {"white", "yellow"}
        };

        System.out.println("행갓수 : " + arr.length);
        System.out.println("0행의 열갯수 : " + arr[0].length);
        System.out.println("1행의 열갯수 : " + arr[1].length);

        System.out.println("출력 1");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
