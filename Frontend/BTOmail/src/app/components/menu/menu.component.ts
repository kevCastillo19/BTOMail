import { Component, OnInit } from '@angular/core';
import { faEnvelope, faPaperPlane, faStar, faExclamationTriangle, faTrashAlt } from "@fortawesome/free-solid-svg-icons";
import { RouterLinkActive } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  faEnvelope = faEnvelope; 
  faPaperPlane = faPaperPlane; 
  faStar = faStar; 
  faExclamationTriangle = faExclamationTriangle; 
  faTrashAlt = faTrashAlt;
  RouterLinkActive = RouterLinkActive;
  
  constructor() { }

  ngOnInit(): void {
  }

}
