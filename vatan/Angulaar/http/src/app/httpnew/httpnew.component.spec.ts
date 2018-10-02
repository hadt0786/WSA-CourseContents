import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpnewComponent } from './httpnew.component';

describe('HttpnewComponent', () => {
  let component: HttpnewComponent;
  let fixture: ComponentFixture<HttpnewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HttpnewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HttpnewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
