import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewHttpComponentComponent } from './new-http-component.component';

describe('NewHttpComponentComponent', () => {
  let component: NewHttpComponentComponent;
  let fixture: ComponentFixture<NewHttpComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewHttpComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewHttpComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
