public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
    Map<String, Integer> countMap = new HashMap<>();
    for (String s : stringList) {
        countMap.put(s, countMap.getOrDefault(s, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();
    for (String q : queries) {
        result.add(countMap.getOrDefault(q, 0));
    }

    return result;
}