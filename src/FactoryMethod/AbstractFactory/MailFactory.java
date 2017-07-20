package FactoryMethod.AbstractFactory;

/**
 * Created by Jeremy on 2017/6/30.
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
