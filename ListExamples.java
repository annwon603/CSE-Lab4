import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class ListExamples {

  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
  static List<String> filter(List<String> list, StringChecker sc) {
    List<String> result = new ArrayList<>();
    int counter = 0;
    for(String s: list) {
      if(sc.checkString(s)) {
        result.add(counter, s);
        counter++;
      }
      
    }
    return result;
  }


  // Takes two sorted list of strings (so "a" appears before "b" and so on),
  // and return a new list that has all the strings in both list in sorted order.
  static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    int index1 = 0, index2 = 0;
    int resultLimit = list1.size() + list2.size();
    int counter = 0;
    while(index1 < list1.size() && index2 < list2.size()) {
      if(list1.get(index1).compareTo(list2.get(index2)) < 0) {
        result.add(list1.get(index1));
        index1 += 1;
        counter++;
      }
      else {
        result.add(list2.get(index2));
        index2 += 1;
        counter++;
      }
    }
    while(index1 < list1.size() && counter < resultLimit) {
      result.add(list1.get(index1));
      index1 += 1;
      counter++;
    }
    while(index2 < list2.size() && counter < resultLimit) {
      result.add(list2.get(index2));
      index1 += 1;
      counter++;
    }
    return result;
  }


}