//
//  main.swift
//  Delegation
//
//  Created by Mohammad Kiani on 2019-10-22.
//  Copyright © 2019 mohammadkiani. All rights reserved.
//

import Foundation
protocol CallBackProtocol {
    func happen()
}

class classA {
    var delegate : CallBackProtocol?
    func doSomething() {
        delegate?.happen()
    }
}

class classB : CallBackProtocol {
    func happen() {
        print("happen function is called")
    }
}

var a = classA()
var b = classB()
//a.delegate = b

a.doSomething()

enum Size {
    case large
    case medium
    case small
}
struct Cookie {
    var size : Size
}

struct Bakery {
    var delegate : Notification?
    var cookie : Cookie = Cookie(size: .medium)
    var number : Int = 5
    func cookiesReady() {
        print("Cookies are ready to be delivered")
        delegate?.notify(cookie, number)
    }
}

struct CookieShop : Notification {
    func notify(_ cookie: Cookie, _ number: Int) {
        print("\(number) fresh cookies arrived with size \(cookie.size)")
    }
    
    func cookieArrived() {
        print("Fresh cookies arrived")
    }
}
protocol Notification {
    func notify(_ cookie: Cookie, _ number: Int)
}

var bakery = Bakery()
bakery.cookie.size = .large
bakery.number = 10
var shoppers = CookieShop()
bakery.delegate = shoppers
bakery.cookiesReady()
