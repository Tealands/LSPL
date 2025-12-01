

using System;

class Hello
{
    static void Main()
    {
        Console.WriteLine("Hello, World!");
    }
}
----------------------------------------------------------------
var x = 123;
var y = 456;

if (x < y)
{
    Console.WriteLine("xよりもyのほうが大きいです。");
}
----------------------------------------------------------------
var text1 = "abc";
var text2 = "xyz";

if (text1 == text2)
{
    Console.WriteLine("2つのテキストは同じです。");
}
else
{
    Console.WriteLine("2つのテキストは異なります。");
}
----------------------------------------------------------------
class Person
{
    public string Name { get; set; }
c

    public void Introduce()
    {
        Console.WriteLine($"こんにちは、私は{Name}です。{Age}歳です。");
    }
}

Person person = new Person { Name = "鈴木花子", Age = 30 };
person.Introduce();
 
----------------------------------------------------------------
 



