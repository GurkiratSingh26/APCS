/*Kirat Singh
APCS
13 October 2022
*/
import java.util.Scanner;

public class BibleStory {

    private String storyies;

    public BibleStory(String sOne) {
        storyies = sOne;
    }

    public String toString() {
        return storyies;
    }

    public static void main(String args[]) {
        System.out.println("A random Bible story will be displayes.");
        Scanner answerInput = new Scanner(System.in);
        System.out.print("Enter yes to read a story or no if not:");
        String yesorno = answerInput.next();


        BibleStory d = new BibleStory("Title: Noah's Ark\n" + "- The Flood God saved Noah and his family (8 people altogether) along with " +
                "\n" +
                "all kinds of land animals and birds through the ark " +
                "that Noah built at God’s instruction. God caused it to rain for 40 " +
                "\n" +
                "days and the waters covered the whole earth, even the highest mountains. " +
                "Noah and his family were in the ark for a year and 10 days until " + "\n" +
                "the water evaporated enough and left dry land.\n" +
                "All of mankind today is descended from Noah and one of his three sons–Shem, " + "\n" +
                "Ham, and Japheth. The family of Shem is the one focused on mostly in the Bible as the Jews come through him." + "\n"
                + "Bible Refernce: Genesis 7:1." + "\n"
                + "Characters: Noah, and God." + "\n" + "Time:600 BCE." + "\n"
        );


        BibleStory c = new BibleStory("Title: The Exodus from Egypt " + "\n" +
                "- Moses was born to an Israelite family, but because of the law at the time, which was to kill all male children, " + "\n" +
                "through God’s providence, he was adopted by Pharaoh’s daughter. He knew his people and his God, however, and was " + "\n" +
                "determined to help his people be delivered from slavery. His timing was not God’s timing though. When he was 40 years old," + "\n" +
                " he had to run away from Egypt because he had killed an Egyptian for beating one of his people. He was gone for 40 years and only " + "\n" +
                "came back at age 80 when God directly spoke to him and told him to go back to lead the people out of Egypt. He did this with " + "\n" +
                "the help of his brother, Aaron. God performed 10 plagues in Egypt to demonstrate His power over their false gods. Finally, Pharaoh let" + "\n" +
                " the Israelites leave. God had Moses lead them through the middle of the Red Sea, as it was divided with a wall of water on each side of them. " + "\n" +
                "The Egyptians had changed their mind and tried to follow, but God drowned their army in the sea. God led the Israelites with a cloud by day and fire " + "\n" +
                "that floated in the sky at night. He provided them with food and water. He led them to Mount Sinai, where He gave them The Law, including the Ten" + "\n" +
                " Commandments. This is where you might say that they actually became a nation, since now they had a national law." + "\n" + "Bible Refernce: Exodus 14." + "\n"
                + "Characters:  Aaron, Caleb, Joshua, Moses." + "\n" + "Time:13th century bce."
        );
        if (yesorno.equals("yes")) {
            for (int i = 0; i < 1; i++) {
                int randonprobelm = (int) (Math.random() * 2 + 1);

                switch (randonprobelm) {
                    case 1:
                        System.out.println(c.toString());
                        break;
                    case 2:
                        System.out.println(d.toString());
                        break;

                }

            }

        } else {
            System.out.println("Bye.");
        }
    }
}
