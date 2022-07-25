package hw6.Bet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Storage {
    List list = new ArrayList();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(list, storage.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "Storage: " + list;
    }
}


