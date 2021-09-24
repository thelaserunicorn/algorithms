## Binary Search Implementation In Python

def binary_search(arr,x):
    l = 0;
    r = len(arr)-1

    ## base case
    while l<=r:
        
        mid = l + (r-l)//2

        if arr[mid] == x:
            return mid
        
        elif arr[mid] < x:
            l = mid + 1;
        else:
            r = mid - 1
    return - 1

arr = [3,4,6,8,10]
x=10

result = binary_search(arr,x)
if result != -1:
    print(f"element is at {result}th index")
else:
    print("element is not present in the array")
