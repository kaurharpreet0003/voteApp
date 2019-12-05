import Foundation

print("Hello World")

func a(p: String) -> String {
    var b = p
    let charFirst = b.removeFirst()
    let charSecond = b.removeFirst()
    b.append(charFirst)
    b.append(charSecond)
    return String (b)
}

print(a(p: "monica"))
print(a(p: "chandlar"))


func char(str: String) -> String {
    var move = str
    let str_first = move.removeFirst()
    let str_second = move.removeFirst()
    move.append(str_first)
    move.append(str_second)
    return move
}
print (char(str: "harpreet"))
print (char(str: "Harpreet"))



func last(char: String) -> String {
    var str1 = char
    let firstChar = str1.removeLast()
    let secondChar = str1.removeLast()
    str1.insert(firstChar, at: str1.startIndex)
    str1.insert(secondChar, at: str1.startIndex)
    return str1
}
print(last(char: "preet"))
print(last(char: "PREET"))

 


func last(str: String) -> String {
    var char = str
    let firstValue = char.removeLast()
    let secondValue = char.removeLast()
    char.insert(firstValue, at: char.startIndex)
    char.insert(secondValue, at: char.startIndex)

    return char  
}

print(last(str: "HARP"))
print(last(str: "harp"))
/** wrong
func middle(str: String) -> String {
    var char = str
    let firstString = char
    let secondString = char
    char.insert(secondString, at: (middle.firstString)
    return char
}

print(middle(str: "harp"))
print(middle(str: "HARP"))*/

















