import com.leo.dummy.Dummy;

public class DummyConsumer {
    public String dummyValue() {
        final Dummy dummyProducer = new Dummy();
        return dummyProducer.dummyValue();
    }
}
