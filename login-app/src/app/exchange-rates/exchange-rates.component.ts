import { Component, OnInit } from '@angular/core';
import { ExchangeRate } from '../model/exchange-rates';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-exchange-rates',
  templateUrl: './exchange-rates.component.html',
  styleUrls: ['./exchange-rates.component.css'],
  providers:[SharedService]
})
export class ExchangeRatesComponent implements OnInit {

  exchangeRates : ExchangeRate[];
  constructor(private service : SharedService) { }

  ngOnInit() {
    this.getRates();
  }

  getRates(){
    this.service.getExchangeRates().subscribe((data:ExchangeRate[]) => {
      console.log(data);
      this.exchangeRates = data;
    });
  }

}
