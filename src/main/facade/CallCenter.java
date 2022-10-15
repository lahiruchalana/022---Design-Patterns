package main.facade;

public class CallCenter {

    private Telephone telephone;
    private Recorder recorder;
    private Pc pc;
    private Client client;
    private CallPerson callPerson;

    public CallCenter() {
        this.telephone = new Telephone();
        this.recorder = new Recorder();
        this.pc = new Pc();
        this.client = new Client();
        this.callPerson = new CallPerson();
    }

    public void processingCallCenter() {
        CallCenter callCenter = new CallCenter();

        System.out.println("Starts the process of Call Center");
        callCenter.client.getCall();
        callCenter.telephone.receivedCall();
        callCenter.callPerson.answerCall();
        callCenter.recorder.recordCall();
        callCenter.pc.findData();
        System.out.println("Ends the process of Call Center");
    }
}
