from sort.sort import selection_sort


def test_selection_sort():
    assert selection_sort([]) == []
    assert selection_sort([1]) == [1]
    assert selection_sort([1, 2]) == [1, 2]
    assert selection_sort([3, 2, 1]) == [1, 2, 3]
    assert selection_sort([1, 4, 3, 2, 1]) == [1, 1, 2, 3, 4]
    assert selection_sort([1, 2, 3, 2, 1, 0]) == [0, 1, 1, 2, 2, 3]
    assert selection_sort(["abc", "def", "a"]) == ["a", "abc", "def"]
