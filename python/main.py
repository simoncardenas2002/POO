from car import Car

if __name__ == '__main__':
  print("Hello")
  car=Car()
  car.license="KAO818"
  car.driver="Simón Cárdenas"
  print(vars(car))


  car2=Car()
  car2.license="JIW946"
  car2.driver="Salome Solano"
  print(vars(car2))

