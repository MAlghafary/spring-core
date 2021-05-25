package mutaz.code.springcode;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger();


    public SequenceGenerator() {
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getInitial() {
        return initial;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }


    public String getNext(){
        StringBuilder sb = new StringBuilder();
        sb
                .append(getPrefix())
                .append(getInitial())
                .append(counter.incrementAndGet())
                .append(getSuffix());
        return sb.toString();
    }
    @Override
    public String toString() {
        return "SequenceGenerator{" +
                "prefix='" + prefix + '\'' +
                ", suffix='" + suffix + '\'' +
                ", initial=" + initial +
                ", counter=" + counter +
                '}';
    }
}
