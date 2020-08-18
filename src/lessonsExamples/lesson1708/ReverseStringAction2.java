package lessonsExamples.lesson1708;

public class ReverseStringAction2 implements Action {

    @Override
    public String doAction(String stringToReverse) {
        if (stringToReverse == null){
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(stringToReverse); //аналог класса стринг со своим набором методов
        return stringBuffer.reverse().toString();
    }
}
