import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  //parameters received from spring boot
    @Input() id: string;
    @Input() name: string;
    @Input() dep: string;
    @Input() des: string;
    @Input() loc: string;

  constructor() { }

  ngOnInit() {}

}
