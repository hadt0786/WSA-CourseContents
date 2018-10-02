import { TestBed, inject } from '@angular/core/testing';

import { ReuseService } from './reuse.service';

describe('ReuseService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ReuseService]
    });
  });

  it('should be created', inject([ReuseService], (service: ReuseService) => {
    expect(service).toBeTruthy();
  }));
});
