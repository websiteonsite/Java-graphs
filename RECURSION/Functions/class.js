//constructor function

function Vehicle(name, color, wheels) {
    this.name = name;
    this.color = color;
    this.wheels = wheels;

    this.getDetails = function () {
        console.log(`
        The ${this.name} is ${this.color} in color,
        It has ${wheels} wheels`
    );
    };
}

const car = new Vehicle('Car', 'blue', 4);
car.getDetails();


//Classes in JS
class VehicleCl {
    //Private properties
    #regNumber
    //constructor
    constructor(name, color, wheels, number) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.#regNumber = number;
    }
    //Private Method
    #getNumber(number) {
        return number;
    }
    //methods
    getDetails() {
        console.log(`
        The ${this.name} is ${this.color} in color,
        It has ${this.wheels} wheels.
        Registraton Number is : ${this.#getNumber(this.#regNumber)}
        `);
    }
}

const veh1 = new VehicleCl(
    "Scooter",
    "Grey",
    2,
    8866
);
//console.log(veh1.getDetails);

console.log(veh1);
veh1.name = 'Car';
//console.log(veh1.#regNumber);
veh1.getDetails();