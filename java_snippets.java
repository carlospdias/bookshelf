 public static boolean isCollectionNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static void main(String[] args) {
        // Example usage
        List<String> strings = null;
        Set<Integer> numbers = Set.of();

        System.out.println(isCollectionNullOrEmpty(strings)); // Output: true (null collection)
        System.out.println(isCollectionNullOrEmpty(numbers)); // Output: true (empty collection)

        List<String> validStrings = List.of("Hello", "World");
        System.out.println(isCollectionNullOrEmpty(validStrings)); // Output: false (not empty and not null)
    }
