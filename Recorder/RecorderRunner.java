public class  RecorderRunner{
    public static void main(String[] args){
        Recorder run = new Recorder();
        run.execute("key1","value1");
        run.execute("key1", null);
        run.execute("key1", "Delete");
        try {
            run.execute("key10", "Delete");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        run.execute("key2", "value2");
        run.execute(null, null);
    }
}