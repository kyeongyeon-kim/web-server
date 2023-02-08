class Counter {
    #num;
    #btnInc;
    #btnDec;
    #numberSpan;

    constructor(num, btnInc, btnDec, numberSpan) {
        this.#num = num;
        this.#btnInc = btnInc;
        this.#btnDec = btnDec;
        this.#numberSpan = numberSpan;
        this.checkDisable();
    }

    checkDisable() {
        if (this.#num === 0) {
            this.#btnDec.disabled = true;
        } else {
            this.#btnDec.disabled = false;
        }
    }

    increase() {
        this.#num++;
        this.checkDisable();
    }

    decrease() {
        if (this.#num > 0) {
            this.#num--;
        }
        this.checkDisable();
    }

    start() {
        this.#numberSpan.innerText = this.#num;

        // 동적인 바인딩을 방지하기 위해 arrow함수 사용
        this.#btnInc.addEventListener("click", (e) => {
            this.increase();
            this.#numberSpan.innerText = this.#num;
        });

        this.#btnDec.addEventListener("click", (e) => {
            this.decrease();
            this.#numberSpan.innerText = this.#num;
        })
    }
}

// 원도우가 로드 된 후에 발생하는 이밴트
window.addEventListener("load", function (e) {
    let btnInc = document.getElementById("btn-inc");
    let numberSpan = document.getElementById("number-span");
    let btnDec = document.getElementById("btn-dec");
    
    let counter = new Counter(0, btnInc, btnDec, numberSpan);
    counter.start();
})
