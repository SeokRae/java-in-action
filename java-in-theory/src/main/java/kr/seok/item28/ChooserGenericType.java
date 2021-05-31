package kr.seok.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserGenericType<T> {
    private final List<T> choiceList;

    public ChooserGenericType(Collection<T> choices) {
        this.choiceList = new ArrayList<>(choices);
    }

    /**
     *
     */
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
