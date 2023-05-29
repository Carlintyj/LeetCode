typedef struct {
    int big;
    int medium;
    int small;
} ParkingSystem;


ParkingSystem* parkingSystemCreate(int big, int medium, int small) {
    ParkingSystem* ps = malloc(sizeof(ParkingSystem));
    ps->big = big;
    ps->medium = medium;
    ps->small = small;
    return ps;
}

bool parkingSystemAddCar(ParkingSystem* obj, int carType) {
  if (carType == 1) {
      obj->big -= 1;
      return obj->big >= 0;
  } else if (carType == 2) {
      obj->medium -= 1;
      return obj->medium >= 0;
  } else if (carType == 3) {
        obj->small -= 1;
      return obj->small >= 0;
  }
  return false;
}

void parkingSystemFree(ParkingSystem* obj) {
    free(obj);
}

/**
 * Your ParkingSystem struct will be instantiated and called as such:
 * ParkingSystem* obj = parkingSystemCreate(big, medium, small);
 * bool param_1 = parkingSystemAddCar(obj, carType);
 
 * parkingSystemFree(obj);
*/