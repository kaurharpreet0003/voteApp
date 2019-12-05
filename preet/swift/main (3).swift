//
//  main.swift
//  Animal
//
//  Created by Mohammad Kiani on 2019-10-22.
//  Copyright © 2019 mohammadkiani. All rights reserved.
//

import Foundation

let panda = StuffedAnimal(animalName: "Panda", gadgetName: "Ming", continent: "Asia", number: 200, price: 20)
let snake = StuffedAnimal(animalName: "Cobra", gadgetName: "SSS", continent: "Asia", number: 500, price: 10)
let toucan = StuffedAnimal(animalName: "Toucan", gadgetName: "Bello", continent: "South America", number: 1000, price: 15)

panda.label()
snake.label()
toucan.label()
