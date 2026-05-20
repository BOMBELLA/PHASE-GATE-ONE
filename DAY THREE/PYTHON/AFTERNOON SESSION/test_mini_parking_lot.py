from unittest import TestCase

import mini_parking_lot

class TestMiniParkingLot(TestCase):

       def test_that_a_car_exists(self):               
       
              actual = mini_parking_lot.park_car("Camry", 2)

              expected = "Camry"

              self.assertEqual(actual,expected)


       def test_that_a_slot_is_empty(self):

              actual = mini_parking_lot.empty_car([0])

              expected = "empty slot"

              self.assertEqual(actual,expected)

       def test_that_a_slot_is_occupied(self):

              actual = mini_parking_lot.occupied_car([1])

              expected = "A car is Parked"

              self.assertEqual(actual,expected)


       def test_that_cars_can_be_parked_at_available_slot(self):

              actual = mini_parking_lot.available_slot

              expected = "This slot is occupied"

              self.assertEqual(actual,expected)

              


              

