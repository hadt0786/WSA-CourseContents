import { ZodiacPipe } from './zodiac.pipe';

describe('ZodiacPipe', () => {
  it('create an instance', () => {
    const pipe = new ZodiacPipe();
    expect(pipe).toBeTruthy();
  });
});
