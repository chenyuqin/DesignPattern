package facade_pattern.example;

public interface ILetterProcess {
    void writeContext(String context);

    void fillEnvelope(String address);

    void letterInotoEnvelope();

    void sendLetter();
}
