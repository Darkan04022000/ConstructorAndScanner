public class PC {
    String corps;
    String processor;
    String videocard;
    String operate;
    String cooler;


    @Override
    public String toString() {
        return "PC{" +
                "corps='" + corps + '\'' +
                ", processor='" + processor + '\'' +
                ", videocard='" + videocard + '\'' +
                ", operate='" + operate + '\'' +
                ", cooler='" + cooler + '\'' +
                '}';
    }

    public PC(String corps, String processor, String videocard, String operate, String cooler) {
        this.corps = corps;
        this.processor = processor;
        this.videocard = videocard;
        this.operate = operate;
        this.cooler = cooler;


    }

}


