import java.util.Scanner;
import java.io.File;

public class parse_file {
    public int size;
    private Hashtable<Slide, Integer>  hash_out;

    public parse_file(String file_name){
        //make file and input
        File file = new File(file_name);

        try{
            Scanner input = new Scanner(file);

            //first line is going to be the size
            if(input.hasNextInt()) size = input.nextInt();

            //go line by line to address it
            while(input.hasNextLine()){
                String current_line = input.nextLine();
                parse_line(current_line);
            }

        } catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println(e.toString());
        }
    }

    //goes by each line and prints it (feeling cute might delete later :3)
    public void parse_line(String line){
        System.out.println(line);

    }
}