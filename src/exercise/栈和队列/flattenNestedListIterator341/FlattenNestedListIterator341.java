package exercise.栈和队列.flattenNestedListIterator341;

import java.util.List;

public class FlattenNestedListIterator341 {

//    public class NestedIterator implements Iterator<Integer> {
//        private final Stack<Integer> stack = new Stack<>();
//
//        public NestedIterator(List<NestedInteger> nestedList) {
//            List<NestedInteger> list = nestedList;
//            while (list != null && !list.isEmpty()) {
//
//                for (NestedInteger nestedInteger : list) {
//                    if (nestedInteger.isInteger()) {
//                        stack.push(nestedInteger.getInteger());
//                    } else {
//
//                    }
//                }
//            }
//        }
//
//        @Override
//        public Integer next() {
//
//        }
//
//        @Override
//        public boolean hasNext() {
//
//        }
//    }

     public interface NestedInteger {
        public boolean isInteger();
        public Integer getInteger();
        public List<NestedInteger> getList();
    }
}
