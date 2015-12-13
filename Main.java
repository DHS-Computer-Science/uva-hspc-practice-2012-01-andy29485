//Andriy Zasypkin
//2015-12-13
//Practice 2012 - 01: Grading Exams

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    int nCases = Integer.valueOf(input.readLine());
    for(int i=1; i <= nCases; i++) {
      int nIncorrect = 0;
      int nQuestions = Integer.valueOf(input.readLine());
      String student = input.readLine();
      String key = input.readLine();
      for(int j=0; j<nQuestions; j++) {
        if(student.charAt(j) != key.charAt(j)) nIncorrect++;
      }
      System.out.printf("Case %d: %d\n", i, nIncorrect);
    }

    //close stream
    input.close();
    System.exit(0);
  }
}
