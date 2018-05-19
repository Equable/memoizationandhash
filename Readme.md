<h1><b>Recursion and Memoization</b></h1>

<h3><b>Author: Louis Huerta-Blake</b></h3>
<h4><b>README Last Edited: 5/19/2018</b><h4>

<h2><b><u>Summary</u></b></h2>


>So I was busy on hackerrank learning java and lo and behold i had a recursion problem. Then i thought, hey lets go above and beyond and implement memoiztion which lead me on this convoluted chase to create this here do-dad. So, here we are, an application completely irrelevant to my origional task but I learned how to use HashMaps, memoization, and how to get around huge numbers where long just wont do it. My buddy BigInteger and I tackled this one quite well, now i know how to use BigInteger in hashmaps and other useful conditions. Wohoo!
>
>P.S: I also added some a runtime at the end.

<h2><b><u>How It Works</u></b></h2>

>1. A concurrent hash map is intialized in the beginning where the the keys of 0, 1 and 2 are set. They act as the starting point. Unfortunately long is not large enough to show an accurate value before reaching overflow so biginteger is used in its value.
>2. The application runs through a forloop where it prints out each of the resulting values based on the fibonacci sequence using function fib()
>3. in fib(), the method fills a bigint variable with the value of the previous (fib(n-1)) as well as the previous previous. (The less stupid way of saying that is: fib(n-2) ).
>4. It then adds the two bigint variables and puts it into fibresult which is then put if the current key is absent using .putIfAbsent.
>5. I return the result to the origional forloop that then prints the value.
>6. Rinse (or dont, im not your manager) and repeat.



<h2><b><u>Version</u></b></h2>

>* 1.0: Primary release
>   * The greatest Java Fibonacci/Cache thing ever.
>   * Hopefully there doesnt need to be any future releases.
