import java.util.Date;

class VoiceMessageUtil{
    // specify the return type & parameters
    public String greetMessage(){
        Date currentTime = new Date();
        return "Hi, it is "+currentTime ;
    }

    public String greetMessage(String name){
        return "Hi, "+ name;
    }

    public String greetMessage(int count){
        return "Hi * " + count;
    }

    public void printArr(int[] arr){
        System.out.println("----- printArr method -----");
        for(int i= 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void printArr(String[] arr){
        System.out.println("----- printArr method (String[]) -----");
        for(String element : arr){
            System.out.println(element);
        }
    }

}