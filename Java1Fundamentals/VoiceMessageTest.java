import java.util.ArrayList;
class VoiceMessageTest{
    public static void main(String[] args){
        VoiceMessageUtil newBot = new VoiceMessageUtil();
        System.out.println(newBot.greetMessage());
        System.out.println(newBot.greetMessage("Pepper"));
        System.out.println(newBot.greetMessage(6));

        /* Behind the scene
        1. When VoiceMessageTest.java is compiled, it reads the instantiation of VoiceMessageUtil class
        2. The compiler search for VoiceMessageUtil.java in the same package/folder to compile
        3. Util file is compiled and all the methods in util can be used
        */


        // 5. Casting (implicit & explicit, Null VALUE)
        int happiness = 10;
        double doubleHappiness = happiness;
        // implicit casting: int --> double (no loss of data)
        System.out.println("Happiness: " + happiness);
        System.out.println("Happiness (in double): " + doubleHappiness);

        // explicit casting: double --> int (loss of data)
        double assignmentTime = 1.5;
        int intAssignmentTime = (int) assignmentTime;
        System.out.println("assignmentTime: " + assignmentTime);
        System.out.println("assignmentTime (in int): " + intAssignmentTime);

        // 7. Fixed Array & Loops
        int[] messagesPerDay = new int[3]; // int cannot be null
        messagesPerDay[0] = 5;
        messagesPerDay[1] = 8;
        messagesPerDay[2] = 6;

        int[] messagesPerDay2 = { 5, 8, 6};
        String[] messages = {"Please call back!", 
            "Make sure you install jdk", 
            "DO NOT INSTALL VS CODE EXTENSION!"};
        newBot.printArr(messagesPerDay);
        newBot.printArr(messagesPerDay2);
        newBot.printArr(messages);

        System.out.println(messages);

        // 8. ArrayList
        ArrayList<String> reminders = new ArrayList<String>();
        // push
        reminders.add("DO NOT INSTALL VS CODE EXTENSION");
        reminders.add("Do the assignments");
        reminders.add("Stay hydrated");
        // pop
        reminders.remove(1);
        reminders.remove("Stay hydrated");
        // update
        reminders.set(0, "20 minutes rule");
        // length

        System.out.println(reminders);
        System.out.println("Length : " + reminders.size());


    }
}