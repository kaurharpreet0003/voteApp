//
//  main.swift
//  OOP_Ex1
//
//  Created by Mohammad Kiani on 2018-09-18.
//  Copyright © 2018 Mohammad Kiani. All rights reserved.
//

import Foundation

let quidam = Patient(74.5, 1.75)
quidam.display()
print("BMI: \(quidam.bmi())")

quidam.massHeight = (-2.0, 4.5)
quidam.display()

//quidam.getSetMass = -2.0 ; quidam.getSetHeight = 4.5
