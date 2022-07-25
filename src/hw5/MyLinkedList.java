package hw5;

public class MyLinkedList<T> implements MyLinkedListInt<T> {
    private int size = 0;
    private ChainLink<T> first;
    private ChainLink<T> last;

    private class ChainLink<T> {
        private T element;
        private ChainLink<T> next;
        private ChainLink<T> prev;

        public ChainLink(T element, ChainLink<T> next, ChainLink<T> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public ChainLink<T> getNext() {
            return next;
        }

        public void setNext(ChainLink<T> next) {
            this.next = next;
        }

        public ChainLink<T> getPrev() {
            return prev;
        }

        public void setPrev(ChainLink<T> prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "{" + element + "}";
        }

    }

    @Override
    public void add(T obj) {
        ChainLink<T> temp = last;
        if (size == 0) {
            last = new ChainLink<>(obj, null, null);
            first = last;
        } else {
            last = new ChainLink<>(obj, null, temp);
            temp.setNext(last);
        }
        size++;
    }

    @Override
    public void add(T obj, int index) {
        if (size == 0) {
            last = new ChainLink<>(obj, null, null);
            first = last;
            return;
        }
        if (index > size || index < 1) {
            System.out.println("Такой позиции нет в массиве");
        } else {
            ChainLink<T> temp = last;
            ChainLink<T> insertPrev = null;
            ChainLink<T> insertNext = null;
            for (int i = 0; i < size; i++) {
                if (i == size - index) {
                    if (temp == first) {
                        temp.setPrev(new ChainLink<>(obj, temp, null));
                        first = temp.prev;
                        size++;
                        break;
                    }
                    if (temp == last) {
                        temp = temp.prev;
                        insertPrev = temp;
                        temp = temp.next;
                        temp.setPrev(new ChainLink<>(obj, temp, insertPrev));
                        last = temp;
                        size++;
                        break;
                    }
                    insertNext = temp;
                    temp = temp.prev;
                    insertPrev = temp;
                    temp.setNext(new ChainLink<>(obj, insertNext, insertPrev));
                    temp = temp.next;
                    insertNext.setPrev(temp);
                    size++;
                    break;
                }
                temp = temp.prev;
            }

        }
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;

    }

    @Override
    public void remove(int index) {
        if (index > size || index < 1) {
            System.out.println("Такого элемента нет в массиве");
        } else {
            ChainLink<T> temp = last;
            ChainLink<T> deleteNext = null;
            ChainLink<T> deletePrev = null;
            for (int i = 0; i < size; i++) {
                if (i == size - index) {
                    deleteNext = temp.next;
                    deletePrev = temp.prev;
                    if (temp == last) {
                        temp = temp.prev;
                        temp.setNext(null);
                        last = temp;
                        break;
                    }
                    if (temp == first) {
                        temp = temp.next;
                        temp.setPrev(null);
                        first = temp;
                        break;
                    }
                    temp = temp.next;
                    temp.setPrev(deletePrev);
                    temp = temp.prev;
                    temp.setNext(deleteNext);
                    break;
                }
                temp = temp.prev;
            }
            size--;
        }
    }

    @Override
    public T get(int index) {
        if (index > size || index < 1) {
            System.out.println("Такого элемента нет в массиве");
            return null;
        } else {
            ChainLink<T> temp = last;
            for (int i = 0; i < size; i++) {
                if (i == size - index) {
                    //return (T) temp;
                    break;
                }
                temp = temp.prev;
            }
            return (T) temp;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Тут пусто =)";
        } else {
            ChainLink<T> temp = last;
            String str = last.toString();
            while (temp.getPrev() != null) {
                temp = temp.prev;
                str = temp + ", " + str;
            }
            return "[" + str + "]";
        }
    }
}
