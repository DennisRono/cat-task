def denno(s):
    j = (len(s)//3-2)*3

    s.sort(reverse=True)
    a = [s[1:j:3],s[2:j:3],s[:j:3]]

    sum_a = list(map(sum,a))
    for x in s[j:]:
        i = sum_a.index(min(sum_a))
        sum_a[i] += x
        a[i].append(x)
    return print(a)

denno([2,4,7,3,2,4,6])
